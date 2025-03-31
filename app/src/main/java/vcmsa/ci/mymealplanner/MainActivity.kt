package vcmsa.ci.mymealplanner

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtInput = findViewById<EditText>(R.id.edtInput)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnAnswer = findViewById<Button>(R.id.btnAnswer)
        val btnClear = findViewById<Button>(R.id.btnClear)



        btnAnswer.setOnClickListener {
        val input = edtInput.text.toString().trim().toLowerCase()
            val mealSuggestion = when (input) {
                "morning" -> "Have some porridge.Some eggs and bacon is also recommended with a coffee"
                "mid-morning" -> "Have fruit bowl or a granola bar and a bottle of water"
                "afternoon" -> "Have a sandwich or a chicken cezar salad and an orange juice"
                "mid-afternoon" -> "Have a blueberry muffin on a cup of tea"
                "dinner" -> "Have some basmati rice and lamb curry in durban curry sause with a coke "
                "mid-night snack" -> "Treat yourself to some cake and tea"




                else -> "Please enter a valid time of day: morning,mid-morning,afternoon,mid-afternoon,dinner,mid-night snack"
            }
            txtResult.text = mealSuggestion









        }

        btnClear.setOnClickListener {
         txtResult.text = ""
         edtInput.text.clear()





        }















































        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}