package com.android.stemexeframework

import androidx.fragment.app.Fragment

interface IStemexeModule {

    fun initialize(host: IStemexeHost)
    fun activate(config: HashMap<String, String>, callback: (fragment:Fragment) -> Unit)
    fun getDataProviders(providerType: String, callback: (result: ArrayList<StemexeDataProvider>?) -> Unit)
    fun openUrl(url: String, context: HashMap<String, String>, callback: (result: Boolean?) -> Unit)

}