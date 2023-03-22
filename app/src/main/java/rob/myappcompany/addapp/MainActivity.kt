package rob.myappcompany.addapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) View の取得
        val et1: EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)

        val btnAdd: Button = findViewById(R.id.btnAdd)
        val btnClear: Button = findViewById(R.id.btnClear)

        val tvAns: TextView = findViewById(R.id.tvAns)

        // 2) クリック処理(足し算)
        btnAdd.setOnClickListener {

            // 4) 条件分岐
            if (et1.text.toString() == ("") || et2.text.toString() == ("")) {
                // 4-1) エラー処理: トースト
                Toast.makeText(this, "お願い💕", Toast.LENGTH_LONG).show()



                // 4-2) エラー処理: アラートダイアログ
                AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage("数字を入れてください")
                    .setPositiveButton("OK", null)
                    .show()
            } else {
                // Edit(編集)型 => String(文字)型 => int型
                val sum: Int = et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計は $sum"
            }
        }

        // 3) クリア処理
        btnClear.setOnClickListener {
            et1.text.clear()
            et2.text.clear()
            tvAns.text = "答え"
        }
    }
}
