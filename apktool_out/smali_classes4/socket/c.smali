.class public final synthetic Lsocket/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsocket/e;


# direct methods
.method public synthetic constructor <init>(Lsocket/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsocket/c;->a:Lsocket/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsocket/c;->a:Lsocket/e;

    invoke-static {v0}, Lsocket/e;->a(Lsocket/e;)V

    return-void
.end method
