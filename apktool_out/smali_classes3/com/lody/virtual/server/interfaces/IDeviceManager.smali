.class public interface abstract Lcom/lody/virtual/server/interfaces/IDeviceManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/interfaces/IDeviceManager$Stub;,
        Lcom/lody/virtual/server/interfaces/IDeviceManager$Default;
    }
.end annotation


# virtual methods
.method public abstract getDeviceConfig(I)Lcom/lody/virtual/remote/VDeviceConfig;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract isEnable(I)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract setEnable(IZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract updateDeviceConfig(ILcom/lody/virtual/remote/VDeviceConfig;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
