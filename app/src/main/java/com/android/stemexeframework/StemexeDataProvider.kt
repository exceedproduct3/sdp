package com.android.stemexeframework

import java.io.Serializable

class StemexeDataProvider(
    var title: String?,
    var system: String?,
    var tenatId: String?,
    var providerId: String?,
    var itemsType: String?
) : Serializable {

    var nextLevelDataProvider: StemexeDataProvider? = null

    var onGetProviderData: ((s: String, callback: (ArrayList<StemexeProviderData>, String) -> Unit) -> Unit)? = null
}

