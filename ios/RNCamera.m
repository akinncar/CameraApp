#import "RNCamera.h"

@interface RNCamera ()

@end

@implementation RNCamera

- (id)initWithBridge:(RCTBridge *)bridge
{
//  if((self = [super init])) {
//    self.bridge = bridge;
//    self.session = [AVCaptureSession new];
//    self.sessionQueue = dispatch_quere_create("cameraQueue", DISPATCH_QUEUE_SERIAL);
//  }
  
  return self;
}

- (void)layoutSubviews
{
  [super layoutSubviews];
  self.previewLayer.frame = self.bounds;
  [self setBackgroundColor:[UIColor redColor]];
  [self.layer insertSublayer:self.previewLayer atIndex:0];
}

@end
