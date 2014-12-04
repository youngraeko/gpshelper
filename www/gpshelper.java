var geohelper=  {
    gpsCheckEvent: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback, 		// success callback function
            errorCallback, 		// error callback function
            'GPSHelper', 		// mapped to our native Java class called "Calendar"
            'checkGPSEnabled', 		// with this action name
            null,                  	// and this array of custom arguments to create our entry              
        );
    }
}
module.exports = geohelper;
