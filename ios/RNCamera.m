#import "RNCamera.h"
#import <React/RCTUtils.h>
#import <React/UIView+React.h>

@interface RNCamera ()

@property (nonatomic, weak) RCTBridge *bridge;
@property(nonatomic, strong) AVCaptureSession *session;
@property(nonatomic, strong) AVCaptureVideoPreviewLayer *previewLayer;

@end

@implementation RNCamera

- (id)initWithBridge:(RCTBridge *)bridge
{
  if((self = [super init])) {
    self.bridge = bridge;
    self.session = [AVCaptureSession new];
    self.sessionQueue = dispatch_queue_create("cameraQueue", DISPATCH_QUEUE_SERIAL);
}
  
  return self;
}

- (void)layoutSubviews
{
  [super layoutSubviews];
  self.previewLayer.frame = self.bounds;
  [self setBackgroundColor:[UIColor redColor]];
  [self.layer insertSublayer:self.previewLayer atIndex:0];
}

- (void)insertReactSubview:(UIView *)view atIndex:(NSInteger)atIndex
{
    [self insertSubview:view atIndex:atIndex + 1]; // is this + 1 really necessary?
    [super insertReactSubview:view atIndex:atIndex];
    return;
}

@end
