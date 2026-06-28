.class Lorg/osmdroid/tileprovider/cachemanager/a$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/tileprovider/cachemanager/a$g;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/osmdroid/tileprovider/cachemanager/a$g;


# direct methods
.method constructor <init>(Lorg/osmdroid/tileprovider/cachemanager/a$g;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a$g$b;->a:Lorg/osmdroid/tileprovider/cachemanager/a$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a$g$b;->a:Lorg/osmdroid/tileprovider/cachemanager/a$g;

    invoke-static {p1}, Lorg/osmdroid/tileprovider/cachemanager/a$g;->f(Lorg/osmdroid/tileprovider/cachemanager/a$g;)Lorg/osmdroid/tileprovider/cachemanager/a$h;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method
