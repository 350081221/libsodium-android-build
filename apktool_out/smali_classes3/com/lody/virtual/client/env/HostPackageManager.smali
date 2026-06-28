.class public abstract Lcom/lody/virtual/client/env/HostPackageManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;
    }
.end annotation


# static fields
.field private static sInstance:Lcom/lody/virtual/client/env/HostPackageManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/env/HostPackageManager;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/HostPackageManager;->sInstance:Lcom/lody/virtual/client/env/HostPackageManager;

    return-object v0
.end method

.method public static init()Lcom/lody/virtual/client/env/HostPackageManager;
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;

    invoke-direct {v0}, Lcom/lody/virtual/client/env/HostPackageManager$HostPackageManagerImpl;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/env/HostPackageManager;->sInstance:Lcom/lody/virtual/client/env/HostPackageManager;

    return-object v0
.end method


# virtual methods
.method public abstract checkPermission(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation
.end method

.method public abstract getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation
.end method

.method public abstract getPackagesForUid(I)[Ljava/lang/String;
.end method

.method public abstract resolveActivity(Landroid/content/Intent;J)Landroid/content/pm/ResolveInfo;
.end method

.method public abstract resolveContentProvider(Ljava/lang/String;J)Landroid/content/pm/ProviderInfo;
.end method
