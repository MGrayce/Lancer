package ga.uprising.desklancer.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import ga.uprising.desklancer.Adapters.Categories;
import ga.uprising.desklancer.R;

import static com.firebase.ui.auth.AuthUI.getApplicationContext;

public class SearchFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Categories adapter;
    private ArrayList<String> catName = new ArrayList<>();
    RecyclerView catRecycler;
    DatabaseReference databaseReference;
    FirebaseAuth firebaseAuth;
    String usersPhone, usersID, usersName;
    ArrayList<String> firebaseKeys = new ArrayList<>();
    TextView art, data, sales, soft, local, other;
    public SearchFragment() {
        // Required empty public constructor
    }
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        catRecycler = rootView.findViewById(R.id.recommended);
        art = rootView.findViewById(R.id.art);
        data = rootView.findViewById(R.id.data);
        sales = rootView.findViewById(R.id.sales);
        soft = rootView.findViewById(R.id.soft);
        local = rootView.findViewById(R.id.local);
        other = rootView.findViewById(R.id.other);

//        databaseReference = FirebaseDatabase.getInstance().getReference().child("categories");
//        databaseReference.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                art.setText(dataSnapshot.child("art").getValue(String.class));
//                data.setText(dataSnapshot.child("data").getValue(String.class));
//                sales.setText(dataSnapshot.child("sales").getValue(String.class));
//                soft.setText(dataSnapshot.child("software").getValue(String.class));
//                local.setText(dataSnapshot.child("local").getValue(String.class));
//                other.setText(dataSnapshot.child("others").getValue(String.class));
//            }
//
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
        return rootView;
    }
}

