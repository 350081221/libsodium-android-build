.class public final synthetic Lcom/yuanqi/master/tools/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/tools/dialog/b;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/tools/dialog/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/a0;->a:Lcom/yuanqi/master/tools/dialog/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/a0;->a:Lcom/yuanqi/master/tools/dialog/b;

    invoke-static {v0, p1}, Lcom/yuanqi/master/tools/o0;->r(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V

    return-void
.end method
