package amitapps.media.practice_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // Declaring TextView from the custom fragment layout
    private lateinit var myTextView: TextView

    // Override function when the view is being created
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        // Inflates the custom fragment layout
        val view: View = inflater.inflate(R.layout.fragment_blank, container, false)

        // Finds the TextView in the custom fragment
        myTextView = view.findViewById<View>(R.id.fragmentTextView) as TextView

        // Gets the data from the passed bundle
        val bundle = arguments
        val message = bundle!!.getString("mText")

        // Sets the derived data (type String) in the TextView
        myTextView.text = message

        return view
    }
}