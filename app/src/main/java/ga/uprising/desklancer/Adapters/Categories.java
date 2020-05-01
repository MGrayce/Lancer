package ga.uprising.desklancer.Adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DatabaseReference;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;
import ga.uprising.desklancer.Models.Category;
import ga.uprising.desklancer.R;

public class Categories extends RecyclerView.Adapter<Categories.MyViewHolder> {

    private Context mContext;
    private ArrayList<String> catName;
    private ArrayList<Category> categories;
    private Activity activity;
    private static final int MY_CONST = 100;
    private String bodyMessage = "";
    private DatabaseReference reference;
    private ArrayList<String> keys;


    public Categories(Context mContext, ArrayList<String> catName, DatabaseReference reference, ArrayList<String> keys) {
        this.mContext = mContext;
        this.catName = catName;
        this.reference = reference;
        this.keys = keys;
        categories = new ArrayList<>();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.category_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.categoryName.setText(catName.get(position));
    }

    private void performAction() {


    }

    @Override
    public int getItemCount() {
        return catName.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        LinearLayout messageFriend, callFriend, removeFriend, addFriend;
        CircleImageView friendImage;
        MyViewHolder(View view) {
            super(view);
            categoryName = view.findViewById(R.id.catName);
        }
    }

}
