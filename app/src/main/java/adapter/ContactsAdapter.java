package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recycler_view.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    //data kata bata ayo track garna kp lagi
    List<Contacts> contactsList;
    public ContactsAdapter(Context mContext,List<Contacts> contactsList){
        this.mContext = mContext;
        this.contactsList= contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact,viewGroup, false);
        //root false=root lai effect hunu vayena

        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
    Contacts contacts = contactsList.get(i);
    //ContactsViewHolder.img
        //data lai bind garna use huncha

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName,tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgprofile);
            tvName = itemView.findViewById(R.id.tvname);
            tvPhone = itemView.findViewById(R.id.tvPhone);



        }
    }


}
