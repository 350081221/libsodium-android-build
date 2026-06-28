.class public Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncAdaptersCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SyncAdapterInfo"
.end annotation


# instance fields
.field public componentName:Landroid/content/ComponentName;

.field public serviceInfo:Landroid/content/pm/ServiceInfo;

.field public type:Landroid/content/SyncAdapterType;


# direct methods
.method constructor <init>(Landroid/content/SyncAdapterType;Landroid/content/pm/ServiceInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->componentName:Landroid/content/ComponentName;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
