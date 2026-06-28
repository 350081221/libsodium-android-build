.class public Ld1/a$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld1/a;


# direct methods
.method public constructor <init>(Ld1/a;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Ld1/a$c;->a:Ld1/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 0

    iget-object p1, p0, Ld1/a$c;->a:Ld1/a;

    invoke-virtual {p1}, Ld1/a;->c()V

    return-void
.end method
