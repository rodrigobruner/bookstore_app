package app.bruner.bookstore;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import app.bruner.bookstore.model.Book;
import app.bruner.bookstore.model.Inventory;

public class MainActivity extends AppCompatActivity {

    protected String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Get linear layout into scroll layout
        LinearLayout parentLayout = findViewById(R.id.parentLayout);

        //Create the inventory
        Inventory inventory = new Inventory(this);
        List<Book> books = inventory.getBooks(); //Get books

        if(books != null) { //DEBUG

            for (Book book : books) {
                //https://medium.com/@nickkorage95/adding-android-views-to-a-layout-using-layoutinflator-5ffeaba4d777
                View bookView = getLayoutInflater().inflate(R.layout.book_layout, parentLayout, false);

                TextView title = bookView.findViewById(R.id.textViewTitle);
                ImageView image = bookView.findViewById(R.id.imageViewBookCover);
                TextView description = bookView.findViewById(R.id.textViewDescription);

                title.setText(book.getTitle());
                image.setImageResource(book.getCover());
                description.setText(book.getShortDescription());

                parentLayout.addView(bookView);

            }
        } else {
            Log.e(TAG,"Book list not loaded");
        }
    }
}