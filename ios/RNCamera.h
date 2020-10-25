#ifndef RNCamera_h
#define RNCamera_h

#import <AVFoundation/AVFoundation.h>
#import <React/RCTBridge.h>
#import <React/RCTBridgeModule.h>
#import <UIKit/UIKit.h>

@class RNCamera;

@interface RNCamera : UIView<AVCaptureMetadataOutputObjectsDelegate,
                             AVCaptureFileOutputRecordingDelegate,
                             AVCaptureVideoDataOutputSampleBufferDelegate>

@property(nonatomic, strong) dispatch_queue_t sessionQueue;

- (id)initWithBridge:(RCTBridge *)bridge;
- (void)layoutSubviews;

#endif /* RNCamera_h */

@end
