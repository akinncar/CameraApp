#import "RNCameraManager.h"
#import <React/RCTViewManager.h>
#import "RNCamera.h"

@interface RNCameraManager : RCTViewManager
@end

@implementation RNCameraManager

RCT_EXPORT_MODULE(RNCameraManager)

- (UIView *)view
{
  return [[RNCamera alloc] initWithBridge:self.bridge];
}

@end
