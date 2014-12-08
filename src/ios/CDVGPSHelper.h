//
//  CDVGPSHelper.h
//  GpsTest
//
//  Created by Youngrae Ko on 12/5/14.
//
//

//#import <Cordova/Cordova.h>
#import <Cordova/CDVPlugin.h>

@interface CDVGPSHelper : CDVPlugin
- (void) checkGPSEnabled:(CDVInvokedUrlCommand *)command;
@end
