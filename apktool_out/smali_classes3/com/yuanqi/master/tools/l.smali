.class public final synthetic Lcom/yuanqi/master/tools/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/l;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/l;->a:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/yuanqi/master/tools/o0;->e(Landroid/view/View;Landroid/content/DialogInterface;)V

    return-void
.end method
