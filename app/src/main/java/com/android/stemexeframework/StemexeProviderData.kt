package com.android.stemexeframework

class StemexeProviderData(
    var title: String?,
    var objectId: String?,
    var extraData: HashMap<String, String>?
) {

    var onGetData : ((String, callback:(ArrayList<StemexeProviderData>, String) -> Unit) -> Unit)?=null

}