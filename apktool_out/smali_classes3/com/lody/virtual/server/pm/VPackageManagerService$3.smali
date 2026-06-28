.class Lcom/lody/virtual/server/pm/VPackageManagerService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/VPackageManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/content/pm/ProviderInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Landroid/content/pm/ProviderInfo;Landroid/content/pm/ProviderInfo;)I
    .locals 0

    .line 2
    iget p1, p1, Landroid/content/pm/ProviderInfo;->initOrder:I

    .line 3
    iget p2, p2, Landroid/content/pm/ProviderInfo;->initOrder:I

    .line 4
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroid/content/pm/ProviderInfo;

    check-cast p2, Landroid/content/pm/ProviderInfo;

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService$3;->compare(Landroid/content/pm/ProviderInfo;Landroid/content/pm/ProviderInfo;)I

    move-result p1

    return p1
.end method
