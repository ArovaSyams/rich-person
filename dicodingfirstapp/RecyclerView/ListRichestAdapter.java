package androidapp.example.dicodingfirstapp.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidapp.example.dicodingfirstapp.R;

public class ListRichestAdapter extends RecyclerView.Adapter<ListRichestAdapter.ListViewHolder> {

    private ArrayList<RichestPerson> listPerson;
    private onItemListener onItemListener1;


    public ListRichestAdapter (ArrayList<RichestPerson> list, onItemListener onItemListener) {
        this.listPerson = list;
        this.onItemListener1 = onItemListener;
    }

    @NonNull
    @Override
    public ListRichestAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_rich, parent, false);
        return new ListViewHolder(view, onItemListener1);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRichestAdapter.ListViewHolder holder, int position) {
        RichestPerson richestPerson = listPerson.get(position);
        Glide.with(holder.itemView.getContext())
                .load(richestPerson.getImage())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgView);
        holder.tvName.setText(richestPerson.getName());
        holder.tvDescription.setText(richestPerson.getDescription());
    }

    @Override
    public int getItemCount() {
        return listPerson.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgView;
        TextView tvName, tvDescription;
        onItemListener onItemListener;

        public ListViewHolder(@NonNull View itemView, onItemListener onItemListener) {
            super(itemView);
            imgView = itemView.findViewById(R.id.image);
            tvName = itemView.findViewById(R.id.text_view1);
            tvDescription = itemView.findViewById(R.id.text_view2);
            this.onItemListener = onItemListener;

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }

    public interface onItemListener {
        void onItemClick (int position);
    }
}



