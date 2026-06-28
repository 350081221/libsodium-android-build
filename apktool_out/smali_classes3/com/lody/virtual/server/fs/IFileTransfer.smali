.class public interface abstract Lcom/lody/virtual/server/fs/IFileTransfer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/fs/IFileTransfer$Stub;,
        Lcom/lody/virtual/server/fs/IFileTransfer$Default;
    }
.end annotation


# virtual methods
.method public abstract listFiles(Ljava/lang/String;)[Lcom/lody/virtual/remote/FileInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract openFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
