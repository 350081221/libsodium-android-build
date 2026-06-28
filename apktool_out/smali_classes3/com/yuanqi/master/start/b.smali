.class public final synthetic Lcom/yuanqi/master/start/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/start/WebActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/start/WebActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/start/b;->a:Lcom/yuanqi/master/start/WebActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/start/b;->a:Lcom/yuanqi/master/start/WebActivity;

    invoke-static {v0, p1}, Lcom/yuanqi/master/start/WebActivity;->C(Lcom/yuanqi/master/start/WebActivity;Landroid/view/View;)V

    return-void
.end method
