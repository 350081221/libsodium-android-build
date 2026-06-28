.class public final synthetic Lcom/yuanqi/master/main/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/yuanqi/master/main/e;->a:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/master/main/e;->a:Z

    invoke-static {v0, p1, p2}, Lcom/yuanqi/master/main/MainViewModel;->h(ZLandroid/content/DialogInterface;I)V

    return-void
.end method
