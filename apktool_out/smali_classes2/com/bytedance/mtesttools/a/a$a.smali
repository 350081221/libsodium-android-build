.class Lcom/bytedance/mtesttools/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/a/a;->d(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/a/a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/a/a$a;->a:Lcom/bytedance/mtesttools/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/a/a$a;->a:Lcom/bytedance/mtesttools/a/a;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
