.class public final synthetic Lcom/yuanqi/master/tools/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Lv3/a;


# direct methods
.method public synthetic constructor <init>(Lv3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/h0;->a:Lv3/a;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/h0;->a:Lv3/a;

    invoke-static {v0, p1}, Lcom/yuanqi/master/tools/o0;->A(Lv3/a;Landroid/content/DialogInterface;)V

    return-void
.end method
