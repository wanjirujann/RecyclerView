import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.R
import kotlinx.android.synthetic.main.row_name_items.view.*

class NamesRecyclerViewAdapter(val namesList: List<student>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_items, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val item=namesList[position]
        holder.rowView.studentName.text=item.name
        holder.rowView.studentdateOfBirth.text=item.dateOfBirth
        holder.rowView.studenthobby.text=item.hobby
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}
