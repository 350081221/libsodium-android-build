.class Lcom/bytedance/mtesttools/d/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/widget/TextView;

.field final synthetic b:Lcom/bytedance/mtesttools/d/a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/a$b;->b:Lcom/bytedance/mtesttools/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
