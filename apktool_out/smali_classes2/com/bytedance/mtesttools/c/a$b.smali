.class Lcom/bytedance/mtesttools/c/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/c/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/c/a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/c/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/c/a$b;->a:Lcom/bytedance/mtesttools/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/a$b;->a:Lcom/bytedance/mtesttools/c/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/a$b;->a:Lcom/bytedance/mtesttools/c/a;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/bytedance/mtesttools/c/a;->e:Lcom/bytedance/mtesttools/c/a$d;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/bytedance/mtesttools/c/a$d;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
