.class Lcom/bytedance/mtesttools/b/d$a;
.super Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeToBannerListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/d;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/d;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/d$a;->a:Lcom/bytedance/mtesttools/b/d;

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeToBannerListener;-><init>()V

    return-void
.end method


# virtual methods
.method public getMediationBannerViewFromNativeAd(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeAdInfo;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/d$a;->a:Lcom/bytedance/mtesttools/b/d;

    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/d;->l(Lcom/bytedance/mtesttools/b/d;Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeAdInfo;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
