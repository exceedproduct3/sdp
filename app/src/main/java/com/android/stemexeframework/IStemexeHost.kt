package com.android.stemexeframework

interface IStemexeHost {

    fun getAuthorizationCode(clientId: String, callback: (result: String?) -> Unit)
    fun getAppAppearanceInformation(callback: (result: StemexeAppSettings?) -> Unit)
    fun getDataProviders(providerType: String, callback: (result: ArrayList<StemexeDataProvider>?) -> Unit)
    fun openUrl(url: String, context: HashMap<String, String>, callback: (result: Boolean?) -> Unit)
}