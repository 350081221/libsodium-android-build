.class Lcom/bytedance/mtesttools/b/f$m;
.super Lcom/bytedance/mtesttools/b/f$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "m"
.end annotation


# instance fields
.field i:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/bytedance/mtesttools/b/f$i;-><init>(Lcom/bytedance/mtesttools/b/f$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/mtesttools/b/f$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/f$m;-><init>()V

    return-void
.end method
