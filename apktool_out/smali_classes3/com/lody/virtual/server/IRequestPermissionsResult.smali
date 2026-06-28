.class public interface abstract Lcom/lody/virtual/server/IRequestPermissionsResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/IRequestPermissionsResult$Stub;,
        Lcom/lody/virtual/server/IRequestPermissionsResult$Default;
    }
.end annotation


# virtual methods
.method public abstract onResult(I[Ljava/lang/String;[I)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
