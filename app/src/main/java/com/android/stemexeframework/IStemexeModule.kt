package com.android.stemexeframework

import android.content.Context
import androidx.fragment.app.Fragment

interface IStemexeModule {

    fun initialize(host: IStemexeHost)
    fun activate(config: HashMap<String, String>, callback: (fragment:Fragment) -> Unit)
    fun getDataProviders(providerType: String, callback: (result: ArrayList<StemexeDataProvider>?) -> Unit)
    fun openUrl(url: String, context: HashMap<String, String>, callback: (result: Boolean?) -> Unit)
    fun getTechnadoptProducts(context: Context, startPageNumber: Int, search:String, language:String, callback: (result: Any?) -> Unit)

}