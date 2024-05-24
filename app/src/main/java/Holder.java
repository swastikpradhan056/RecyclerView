import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class Holder extends RecyclerView.ViewHolder {
    TextView text1, text2, text3;
    View view;
    public Holder(@NonNull View itemView) {
        super(itemView);
        text1 = itemView.findViewById(R.id.txt1);
        text2 = itemView.findViewById(R.id.txt2);
        text3 = itemView.findViewById(R.id.txt3);
        view = itemView;

    }
}
