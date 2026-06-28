.class Lcom/bytedance/mtesttools/b/f$k;
.super Lcom/bytedance/mtesttools/b/f$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# instance fields
.field i:Landroid/widget/ImageView;

.field j:Landroid/widget/ImageView;

.field k:Landroid/widget/ImageView;


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
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/f$k;-><init>()V

    return-void
.end method
