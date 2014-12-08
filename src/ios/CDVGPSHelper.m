//
//  CDVGPSHelper.m
//  GpsTest
//
//  Created by Youngrae Ko on 12/5/14.
//
//

#import "CDVGPSHelper.h"
#import <CoreLocation/CoreLocation.h>

@implementation CDVGPSHelper

- (void) checkGPSEnabled:(CDVInvokedUrlCommand *)command{
    
    NSString *result = @"GPS Disabled";
    
    if([CLLocationManager locationServicesEnabled] &&
       [CLLocationManager authorizationStatus] == kCLAuthorizationStatusAuthorized) {
        result = @"GPS Enabled";
    }
    

    CDVPluginResult *pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end

