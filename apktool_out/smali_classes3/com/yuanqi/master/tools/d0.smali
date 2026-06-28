.class public final synthetic Lcom/yuanqi/master/tools/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lv3/l;

.field public final synthetic b:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;


# direct methods
.method public synthetic constructor <init>(Lv3/l;Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/d0;->a:Lv3/l;

    iput-object p2, p0, Lcom/yuanqi/master/tools/d0;->b:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/d0;->a:Lv3/l;

    iget-object v1, p0, Lcom/yuanqi/master/tools/d0;->b:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/o0;->F(Lv3/l;Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;Landroid/content/DialogInterface;)V

    return-void
.end method
