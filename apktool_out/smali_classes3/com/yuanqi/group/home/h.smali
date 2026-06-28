.class public final synthetic Lcom/yuanqi/group/home/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/HomeActivity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/h;->a:Lcom/yuanqi/group/home/HomeActivity;

    iput-object p2, p0, Lcom/yuanqi/group/home/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/group/home/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/yuanqi/group/home/h;->d:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/yuanqi/group/home/h;->a:Lcom/yuanqi/group/home/HomeActivity;

    iget-object v1, p0, Lcom/yuanqi/group/home/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/yuanqi/group/home/h;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/yuanqi/group/home/h;->d:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, v3}, Lcom/yuanqi/group/home/HomeActivity;->I(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
