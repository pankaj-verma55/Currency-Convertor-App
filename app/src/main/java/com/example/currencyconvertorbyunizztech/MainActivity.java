package com.example.currencyconvertorbyunizztech;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.currencyconvertorbyunizztech.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    double fromValue = 0.0;
    double toValue = 0.0;
    String fromUnit = "";
    String toUnit = "";

    private List<String> units = Arrays.asList(
            "AED : United Arab Emirates Dirham",
            "AFN : Afghan Afghani",
            "ALL : Albanian Lek",
            "AMD : Armenian Dram",
            "ANG : Netherlands Antillean Guilder",
            "AOA : Angolan Kwanza",
            "ARS : Argentine Peso",
            "AUD : Australian Dollar",
            "AWG : Aruban Florin",
            "AZN : Azerbaijani Manat",
            "BAM : Bosnia-Herzegovina Convertible Mark",
            "BBD : Barbadian Dollar",
            "BDT : Bangladeshi Taka",
            "BGN : Bulgarian Lev",
            "BHD : Bahraini Dinar",
            "BIF : Burundian Franc",
            "BMD : Bermudan Dollar",
            "BND : Brunei Dollar",
            "BOB : Bolivian Boliviano",
            "BRL : Brazilian Real",
            "BSD : Bahamian Dollar",
            "BTC : Bitcoin",
            "BTN : Bhutanese Ngultrum",
            "BWP : Botswanan Pula",
            "BYN : Belarusian Ruble",
            "BZD : Belize Dollar",
            "CAD : Canadian Dollar",
            "CDF : Congolese Franc",
            "CHF : Swiss Franc",
            "CLF : Chilean Unit of Account (UF)",
            "CLP : Chilean Peso",
            "CNH : Chinese Yuan (Offshore)",
            "CNY : Chinese Yuan",
            "COP : Colombian Peso",
            "CRC : Costa Rican Colón",
            "CUC : Cuban Convertible Peso",
            "CUP : Cuban Peso",
            "CVE : Cape Verdean Escudo",
            "CZK : Czech Republic Koruna",
            "DJF : Djiboutian Franc",
            "DKK : Danish Krone",
            "DOP : Dominican Peso",
            "DZD : Algerian Dinar",
            "EGP : Egyptian Pound",
            "ERN : Eritrean Nakfa",
            "ETB : Ethiopian Birr",
            "EUR : Euro",
            "FJD : Fijian Dollar",
            "FKP : Falkland Islands Pound",
            "GBP : British Pound Sterling",
            "GEL : Georgian Lari",
            "GGP : Guernsey Pound",
            "GHS : Ghanaian Cedi",
            "GIP : Gibraltar Pound",
            "GMD : Gambian Dalasi",
            "GNF : Guinean Franc",
            "GTQ : Guatemalan Quetzal",
            "GYD : Guyanaese Dollar",
            "HKD : Hong Kong Dollar",
            "HNL : Honduran Lempira",
            "HRK : Croatian Kuna",
            "HTG : Haitian Gourde",
            "HUF : Hungarian Forint",
            "IDR : Indonesian Rupiah",
            "ILS : Israeli New Sheqel",
            "IMP : Manx pound",
            "INR : Indian Rupee",
            "IQD : Iraqi Dinar",
            "IRR : Iranian Rial",
            "ISK : Icelandic Króna",
            "JEP : Jersey Pound",
            "JMD : Jamaican Dollar",
            "JOD : Jordanian Dinar",
            "JPY : Japanese Yen",
            "KES : Kenyan Shilling",
            "KGS : Kyrgystani Som",
            "KHR : Cambodian Riel",
            "KMF : Comorian Franc",
            "KPW : North Korean Won",
            "KRW : South Korean Won",
            "KWD : Kuwaiti Dinar",
            "KYD : Cayman Islands Dollar",
            "KZT : Kazakhstani Tenge",
            "LAK : Laotian Kip",
            "LBP : Lebanese Pound",
            "LKR : Sri Lankan Rupee",
            "LRD : Liberian Dollar",
            "LSL : Lesotho Loti",
            "LYD : Libyan Dinar",
            "MAD : Moroccan Dirham",
            "MDL : Moldovan Leu",
            "MGA : Malagasy Ariary",
            "MKD : Macedonian Denar",
            "MMK : Myanma Kyat",
            "MNT : Mongolian Tugrik",
            "MOP : Macanese Pataca",
            "MRO : Mauritanian Ouguiya (pre-2018)",
            "MRU : Mauritanian Ouguiya",
            "MUR : Mauritian Rupee",
            "MVR : Maldivian Rufiyaa",
            "MWK : Malawian Kwacha",
            "MXN : Mexican Peso",
            "MYR : Malaysian Ringgit",
            "MZN : Mozambican Metical",
            "NAD : Namibian Dollar",
            "NGN : Nigerian Naira",
            "NIO : Nicaraguan Córdoba",
            "NOK : Norwegian Krone",
            "NPR : Nepalese Rupee",
            "NZD : New Zealand Dollar",
            "OMR : Omani Rial",
            "PAB : Panamanian Balboa",
            "PEN : Peruvian Nuevo Sol",
            "PGK : Papua New Guinean Kina",
            "PHP : Philippine Peso",
            "PKR : Pakistani Rupee",
            "PLN : Polish Zloty",
            "PYG : Paraguayan Guarani",
            "QAR : Qatari Rial",
            "RON : Romanian Leu",
            "RSD : Serbian Dinar",
            "RUB : Russian Ruble",
            "RWF :  Rwandan Franc",
            "SAR : Saudi Riyal",
            "SBD : Solomon Islands Dollar",
            "SCR : Seychellois Rupee",
            "SDG : Sudanese Pound",
            "SEK : Swedish Krona",
            "SGD : Singapore Dollar",
            "SHP : Saint Helena Pound",
            "SLL : Sierra Leonean Leone",
            "SOS : Somali Shilling",
            "SRD : Surinamese Dollar",
            "SSP : South Sudanese Pound",
            "STD : São Tomé and Príncipe Dobra (pre-2018)",
            "STN : São Tomé and Príncipe Dobra",
            "SVC : Salvadoran Colón",
            "SYP : Syrian Pound",
            "SZL : Swazi Lilangeni",
            "THB : Thai Baht",
            "TJS : Tajikistani Somoni",
            "TMT : Turkmenistani Manat",
            "TND : Tunisian Dinar",
            "TOP : Tongan Pa'anga",
            "TRY : Turkish Lira",
            "TTD : Trinidad and Tobago Dollar",
            "TWD : New Taiwan Dollar",
            "TZS : Tanzanian Shilling",
            "UAH : Ukrainian Hryvnia",
            "UGX : Ugandan Shilling",
            "USD : United States Dollar",
            "UYU : Uruguayan Peso",
            "UZS : Uzbekistan Som",
            "VEF : Venezuelan Bolívar Fuerte",
            "VND : Vietnamese Dong",
            "VUV : Vanuatu Vatu",
            "WST : Samoan Tala",
            "XAF : CFA Franc BEAC",
            "XAG : Silver Ounce",
            "XAU : Gold Ounce",
            "XCD : East Caribbean Dollar",
            "XDR : Special Drawing Rights",
            "XOF : CFA Franc BCEAO",
            "XPD : Palladium Ounce",
            "XPF : CFP Franc",
            "XPT : Platinum Ounce",
            "YER : Yemeni Rial",
            "ZAR : South African Rand",
            "ZMW : Zambian Kwacha",
            "ZWL : Zimbabwean Dollar"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        compnetInitilize();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void compnetInitilize() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, units);
        binding.fromUnit.setAdapter(arrayAdapter);
        binding.toUnit.setAdapter(arrayAdapter);
        binding.btnConvertor.setOnClickListener(v -> {
            try {
                fromValue = Double.parseDouble(binding.fromValue.getText().toString());
                fromUnit = binding.fromUnit.getSelectedItem().toString();
                toUnit = binding.toUnit.getSelectedItem().toString();
                current_Value();
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void current_Value() {
        try {
            if (fromUnit.equalsIgnoreCase("INR : Indian Rupee") && toUnit.equalsIgnoreCase("USD : United States Dollar")) {
                toValue = fromValue / 83.22;
            } else if (fromUnit.equalsIgnoreCase("USD : United States Dollar") && toUnit.equalsIgnoreCase("INR : Indian Rupee")) {
                toValue = fromValue * 83.22;
            }

            if (fromUnit.equalsIgnoreCase("INR : Indian Rupee") && toUnit.equalsIgnoreCase("EUR : Euro")) {
                toValue = fromValue / 91.40;
            } else if (fromUnit.equalsIgnoreCase("EUR : Euro") && toUnit.equalsIgnoreCase("INR : Indian Rupee")) {
                toValue = fromValue * 91.40;
            }

            if (fromUnit.equalsIgnoreCase("INR : Indian Rupee") && toUnit.equalsIgnoreCase("CAD : Canadian Dollar")) {
                toValue = fromValue / 60.50;
            } else if (fromUnit.equalsIgnoreCase("CAD : Canadian Dollar") && toUnit.equalsIgnoreCase("INR : Indian Rupee")) {
                toValue = fromValue * 60.50;
            }

            if (fromUnit.equalsIgnoreCase("INR : Indian Rupee") && toUnit.equalsIgnoreCase("ZWL : Zimbabwean Dollar")) {
                toValue = fromValue / 3.14;
            } else if (fromUnit.equalsIgnoreCase("ZWL : Zimbabwean Dollar") && toUnit.equalsIgnoreCase("INR : Indian Rupee")) {
                toValue = fromValue * 3.14;
            }
            binding.toValue.setText(String.valueOf(toValue));
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}