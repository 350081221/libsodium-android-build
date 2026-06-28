.class public final synthetic Lcom/yuanqi/group/home/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/j;->a:Lcom/yuanqi/group/home/HomeActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/j;->a:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0, p1, p2}, Lcom/yuanqi/group/home/HomeActivity;->T(Lcom/yuanqi/group/home/HomeActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
