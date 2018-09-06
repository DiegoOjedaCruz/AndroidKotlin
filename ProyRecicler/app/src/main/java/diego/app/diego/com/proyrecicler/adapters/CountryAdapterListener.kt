package diego.app.diego.com.proyrecicler.adapters

import diego.app.diego.com.proyrecicler.models.Country

interface CountryAdapterListener {
    fun onDeleteCountryClick(item: Country, pos: Int)
    fun onUpdateCountryClick(item: Country, pos: Int)
}
