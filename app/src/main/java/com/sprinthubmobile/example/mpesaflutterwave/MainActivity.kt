package com.sprinthubmobile.example.mpesaflutterwave

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flutterwave.raveandroid.RavePayManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_pay_with_mpesa.setOnClickListener {

            openRave()

        }

    }

    private fun openRave(){

         RavePayManager(this)
            .setAmount(10.0)
            .setCountry("KE")
            .setCurrency("KES")
            .setEmail("enyasonjnr@gmail.com")
            .setfName("Emmanuel")
            .setlName("Enya")
            .setNarration("mpesa paymemt")
            .setPublicKey("FLWPUBK-faa27a1d1d5b176471bd9dacce395c32-X")
            .setEncryptionKey("45796d81683251a9dc54a3dc")
            .setTxRef("txRef123456789")
            .acceptAccountPayments(false)
            .acceptCardPayments(false)
            .acceptMpesaPayments(true)
            .acceptAchPayments(false)
            .acceptGHMobileMoneyPayments(false)
            .acceptUgMobileMoneyPayments(false)
            .acceptBankTransferPayments(false)
            .onStagingEnv(true)
//            .setMeta(List<Meta>)
//            .withTheme(styleId)
//            .isPreAuth(boolean)
//            .setSubAccounts(List<SubAccount>)
            .shouldDisplayFee(true )
            .showStagingLabel(true)
            .initialize()
    }
}
