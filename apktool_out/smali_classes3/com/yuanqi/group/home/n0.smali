.class public final synthetic Lcom/yuanqi/group/home/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/HomeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/HomeViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/n0;->a:Lcom/yuanqi/group/home/HomeViewModel;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/n0;->a:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {v0, p1}, Lcom/yuanqi/group/home/HomeViewModel$n;->h(Lcom/yuanqi/group/home/HomeViewModel;Landroid/view/View;)V

    return-void
.end method
