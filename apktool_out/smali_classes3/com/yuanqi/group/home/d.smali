.class public final synthetic Lcom/yuanqi/group/home/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/d;->a:Landroid/content/Intent;

    iput-object p2, p0, Lcom/yuanqi/group/home/d;->b:Lcom/yuanqi/group/home/HomeActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/home/d;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcom/yuanqi/group/home/d;->b:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0, v1, p1, p2}, Lcom/yuanqi/group/home/HomeActivity;->Q(Landroid/content/Intent;Lcom/yuanqi/group/home/HomeActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
