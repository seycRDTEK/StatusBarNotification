//  StatisBarNotification.h
//  originally:
//  LocalNotification.h
//	Phonegap LocalNotification Plugin
//	Copyright (c) Greg Allen 2011 & 2012 Drew Dahlman
//	MIT Licensed

#import <Cordova/CDV.h>

@interface StatusBarNotification : CDVPlugin

- (void)clear:(CDVInvokedUrlCommand*)command;
- (void)notify:(CDVInvokedUrlCommand*)command;

@end
