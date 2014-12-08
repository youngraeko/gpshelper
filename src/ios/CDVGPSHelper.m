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

- (NSString *) checkGPSEnabled{
    
    if([CLLocationManager locationServicesEnabled] &&
       [CLLocationManager authorizationStatus] != kCLAuthorizationStatusDenied) {
        return @"GPS Enabled";
    } else {
        return @"GPS Disabled";
    }
}

@end
