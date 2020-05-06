package com.project.mygopek

object DataMoney {
    private val moneyNames = arrayOf(
        "Indonesia",
        "Malaysia",
        "Brunei Darussalam",
        "thailand",
        "Myanmar",
        "Laos",
        "Camboja",
        "Singapure",
        "Vietnam",
        "Filipina",
        "Timor Leste"
    )
    private val moneyDetails = arrayOf(
        "Rupiah",
        "Ringgit",
        "Dolar Brunei Darussalam",
        "Bath",
        "Kyat",
        "New kip",
        "Riel",
        "Dolar singapure",
        "Dong",
        "Peso",
        "Dolar us"
    )
    private val moneyImages = arrayOf(
        R.drawable.indonesia,
        R.drawable.malaysia,
        R.drawable.brunei,
        R.drawable.thailand,
        R.drawable.myanmar,
        R.drawable.laos,
        R.drawable.kamboja,
        R.drawable.singapure,
        R.drawable.vietnam,
        R.drawable.filipina,
        R.drawable.timorleste
    )
    val listData: ArrayList<Money>
    get() {
        val list = arrayListOf<Money>()
        for (position in moneyNames.indices) {
            val money = Money()
            money.name = moneyNames[position]
            money.detail= moneyDetails[position]
            money.photo= moneyImages[position]
            list.add(money)
        }
        return list
    }
}