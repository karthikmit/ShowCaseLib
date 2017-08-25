
Pod::Spec.new do |s|
  s.name         = "RNShowCaseLib"
  s.version      = "1.0.0"
  s.summary      = "RNShowCaseLib"
  s.description  = <<-DESC
                  RNShowCaseLib
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNShowCaseLib.git", :tag => "master" }
  s.source_files  = "RNShowCaseLib/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  