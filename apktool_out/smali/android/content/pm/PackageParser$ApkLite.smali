.class public Landroid/content/pm/PackageParser$ApkLite;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/content/pm/PackageParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ApkLite"
.end annotation


# instance fields
.field public codePath:Ljava/lang/String;

.field public coreApp:Z

.field public extractNativeLibs:Z

.field public installLocation:I

.field public multiArch:Z

.field public packageName:Ljava/lang/String;

.field public signatures:[Landroid/content/pm/Signature;

.field public splitName:Ljava/lang/String;

.field public use32bitAbi:Z

.field public versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
